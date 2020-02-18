class Main inherits IO {
    fibo_rec(n : Int) : Int {
        if (n = 0) then 0 else
        if (n = 1) then 1 else
        fibo_rec(n - 1) + fibo_rec(n - 2)
        fi
        fi
    };

    fibo_iter(n : Int) : Int {
        let rez1 : Int <- 1,
            rez2 : Int <- 0,
            tmp: Int,
            it : Int <- 1
        in {
            while (it < n) loop
                {
                    tmp <- rez1;
                    rez1 <- rez2 + rez1;
                    rez2 <- tmp;
                    it <- it + 1;
                }
            pool;
            rez1;
        }
    };

    is_zero(n : Int) : Bool {
        if (n = 0) then true else false fi
    };

    main () : Object { {

      -- expecting fibo(6) = 8

      out_string("Implementarea recursiva - fib(6) = ");
      out_int(fibo_rec(4));
      out_string("\n\n");
      out_string("Implementarea iterativa - fib(6) = ");
      out_int(fibo_iter(420));
      out_string("\n");
    } };
};
