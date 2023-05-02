package pro.sky.skyprocollection1.exception;

public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException(){super();
    }
    public EmployeeAlreadyAddedException (String message){super(message);
    }
}



