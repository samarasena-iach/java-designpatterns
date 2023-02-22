package CreationalPatterns.DP03_AbstractFactory;

public class DBEmpDAO implements DAO {
    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }
}
