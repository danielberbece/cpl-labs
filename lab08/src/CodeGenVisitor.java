import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

public class CodeGenVisitor implements ASTVisitor<ST>{
	static STGroupFile templates = new STGroupFile("cgen.stg");
	
	ST mainSection;	// filled directly (through visitor returns)
	ST dataSection; // filled collaterally ("global" access)
	ST funcSection; // filled collaterally ("global" access)
	int currentFormalOffset = 0;
	int label = 100;

	/* 
	 * Plain numbers
	 * TODO 1:
	 */

    @Override
    public ST visit(Int val) {
    	Integer v = Integer.parseInt(val.getToken().getText());
    	Integer high = v >> 16;
    	Integer low = (v << 16) >> 16;
    	System.out.println(val.token.getText() + " " + high + " " + low);
        return templates.getInstanceOf("literal")
                .add("value1", String.valueOf(high))
				.add("value2", String.valueOf(low));
    }
    
    @Override
    public ST visit(FloatNum val) {
        return null;
    }

    @Override
    public ST visit(Bool val) {

    	return null;
    }
    
    /* 
     * Unary operations
     * TODO 1:
     */
    
	@Override
	public ST visit(UnaryMinus uMinus) {
		return null;
	}
    
	/* 
	 * Binary operations
	 * TODO 2:
	 */
    
    @Override
    public ST visit(Plus expr) {
    	var st = templates.getInstanceOf("plus");
    	st.add("e1", expr.left.accept(this))
    		.add("e2",  expr.right.accept(this))
    		.add("dStr", expr.debugStr);
    	
    	return st;
    }
    
    @Override
    public ST visit(Minus expr) {
    	return null;
    }
    
    @Override
    public ST visit(Mult expr) {
    	return null;
    }
    
    @Override
    public ST visit(Div expr) {
    	return null;
    }
	
	@Override
	public ST visit(Relational expr) {
		return null;
	}

    /*
     * Control structures
     * TODO 3:
     */
    
    @Override
	public ST visit(If iff) {

    	return null;
	}

	@Override
	public ST visit(Call call) {
		return null;
	}

    /*
     * Definitions & assignments
     * TODO 4&5:
     */

	@Override
	public ST visit(Assign assign) {
		// TODO 4: generare cod pentru main()
		return null;
	}

	@Override
	public ST visit(VarDef varDef) {
		// TODO 4: generare cod pentru main() și etichetă în .data
		var st = templates.getInstanceOf("global")
				.add("label", varDef.id.token.getText())
				.add("value", 0);
		dataSection.add("e", st);
		dataSection.add("e", st);
		return null;
	}

	@Override
	public ST visit(FuncDef funcDef) {
		// TODO 5: generare cod pentru funcSection. Fără cod în main()!
		for (Formal f: funcDef.formals) {
			f.accept(this);
		}
		currentFormalOffset = 0;

		return null;
	}

	/*
	 * META
	 */
	
	@Override
	public ST visit(Id id) {
		// TODO 5
		return null;
	}

	@Override
	public ST visit(Formal formal) {
		// TODO 5
		formal.offset = currentFormalOffset;
		currentFormalOffset -= 4;
		return null;
	}
	
	@Override
	public ST visit(Type type) {
		return null;
	}

	@Override
	public ST visit(Program program) {
		dataSection = templates.getInstanceOf("sequenceSpaced");
		funcSection = templates.getInstanceOf("sequenceSpaced");
		mainSection = templates.getInstanceOf("sequence");
		
		for (ASTNode e : program.stmts)
			mainSection.add("e", e.accept(this));
		
		//assembly-ing it all together. HA! get it?
		var programST = templates.getInstanceOf("program");
		programST.add("data", dataSection);
		programST.add("textFuncs", funcSection);
		programST.add("textMain", mainSection);
		
		return programST;
	}

}
