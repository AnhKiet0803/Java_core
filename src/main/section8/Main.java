package main.section8;

import main.dao.BaseDao;
import main.dao.StudentDao;
import main.dao.StudentDaoImpl;
import main.dao.SubjectDaoImpl;
import main.enums.FactoryDao;
import main.factory.Factory;

public class Main {
    public static void main(String[] args){
        NumberList<Integer> n1 = new NumberList<>();
        n1.x = 30;
        NumberList<Float> n2 = new NumberList<>();
        n2.x = 30.0f;
        NumberList<String> n3 = new NumberList<>();
        n3.x = "hi";
        n3.info(4,"hi");

        try {
            BaseDao sd = Factory.getModel(FactoryDao.STUDENT);
            BaseDao sb = Factory.getModel(FactoryDao.SUBJECT);
            System.out.println(sd.getAll().size());
            System.out.println(sb.getAll().size());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
