package CreationalPatterns.DP03_AbstractFactory;

public class XMLEmpDAO implements DAO {
    @Override
    public void save() {
        System.out.println("Saving Employee to XML");
    }
}
