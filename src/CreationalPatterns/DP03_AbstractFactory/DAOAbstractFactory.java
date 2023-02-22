package CreationalPatterns.DP03_AbstractFactory;

public abstract class DAOAbstractFactory {

    public abstract DAO createDAO(String type);

}
