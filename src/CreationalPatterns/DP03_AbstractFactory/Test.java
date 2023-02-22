package CreationalPatterns.DP03_AbstractFactory;

public class Test {
    public static void main(String[] args) {
        DAOAbstractFactory daf = DAOFactoryProducer.produce("xml");
        DAO dao = daf.createDAO("emp");
        dao.save();
    }
}
