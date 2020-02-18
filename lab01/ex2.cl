class List inherits IO {
    isEmpty() : Bool { true };

    -- 0, deși cod mort, este necesar pentru verificarea tipurilor
    hd() : Int { { abort(); 0; } };

    -- Similar pentru self
    tl() : List { { abort(); self; } };

    cons(h : Int) : Cons {
        new Cons.init(h, self)
    };

    print() : IO { out_string("\n") };

    append(l : List) : List {{
        abort(); self;
    }};

    reverse() : List {
        self
    };

    map(mapObj : Map) : List {
        self
    };

    filter(filterObj : Filter) : List {
        self
    };
};


class Cons inherits List {
    hd : Int;
    tl : List;

    init(h : Int, t : List) : Cons {
        {
            hd <- h;
            tl <- t;
            self;
        }
    };

    -- Supradefinirea funcțiilor din clasa List
    isEmpty() : Bool { false };

    hd() : Int { hd };

    tl() : List { tl };

    print() : IO {
        {
            out_int(hd);
            out_string(" ");
            -- Mecanismul de dynamic dispatch asigură alegerea implementării
            -- corecte a metodei print.
            tl.print();
        }
    };

    append(l : List) : List {
        let it : List <- tl,
            it2 : List
        in {
            while (not it.isEmpty()) loop {it2 <- it; it <- it.tl();} pool;
            case it2 of
                it2 : Cons => it2.init(it2.hd(), l);
            esac;
            self;
        }
    };

    reverse() : List {
        let revList : List <- new List,
            it : List <- self 
        in {
            while (not it.isEmpty()) loop
                {
                    revList <- new Cons.init(it.hd(), revList);
                    it <- it.tl();
                }
            pool;
            revList;
        }
    };

    map(mapObj : Map) : List {
        {
            hd <- mapObj.apply(hd);
            tl.map(mapObj);
            self;
        }
    };

    filter(filterObj : Filter) : List {
        let newList : List <- new List,
            it : List <- self 
        in {
            while (not it.isEmpty()) loop
            {
                if (filterObj.apply(it.hd())) then
                    newList.cons(it.hd())
                else newList fi;
                it <- it.tl();
            }
            pool;
            newList;
        }
    };
};

class Map inherits IO {
    apply(x : Int) : Int { x };
};

class MapDouble inherits Map {
    apply(x : Int) : Int { x * 2 };
};

class Filter inherits IO {
    apply(x : Int) : Bool { false };
};

class FilterLessThan5 inherits Filter {
    apply(x : Int) : Bool { x < 2 };
};

class Main inherits IO {
    main() : Object {
        let list : List <- new List.cons(1).cons(2).cons(3),
            temp : List,
            list2 : List <- new List.cons(5).cons(0)
        in
            {
                -- Afișare utilizând o buclă while. Mecanismul de dynamic
                -- dispatch asigură alegerea implementării corecte a metodei
                -- isEmpty, din clasele List, respectiv Cons.
                temp <- list.map(new MapDouble);
               -- temp <- temp.map(new MapDouble).filter(new FilterLessThan5);
                while (not temp.isEmpty()) loop
                    {
                        out_int(temp.hd());
                        out_string(" ");
                        temp <- temp.tl();
                    }
                pool;

                out_string("\n");

                -- Afișare utilizând metoda din clasele pe liste.
            --     temp <- list.reverse();
            --    temp.print();
            }
    };
};