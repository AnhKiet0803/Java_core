package main.factory;

import main.dao.BaseDao;
import main.dao.StudentDaoImpl;
import main.dao.SubjectDaoImpl;
import main.enums.FactoryDao;

public class Factory {
    public static BaseDao getModel(FactoryDao s) throws Exception{
        switch (s){
            case STUDENT: return new StudentDaoImpl();
            case SUBJECT: return new SubjectDaoImpl();
            default: throw new Exception();
        }
    }
}
