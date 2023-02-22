package CreationalPatterns.DP03_AbstractFactory;

public class DAOFactoryProducer {

    public static DAOAbstractFactory produce(String factoryType) {
        DAOAbstractFactory daf = null;

        if (factoryType.equals("xml")) {
            return daf = new XMLDAOFactory();
        } else if (factoryType.equals("db")) {
            return daf = new DBDAOFactory();
        }

        return daf;
    }

}
