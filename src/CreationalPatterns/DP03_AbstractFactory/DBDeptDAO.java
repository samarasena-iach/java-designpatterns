package CreationalPatterns.DP03_AbstractFactory;

public class DBDeptDAO implements DAO{
    @Override
    public void save() {
        System.out.println("Saving Department to DB");
    }
}
