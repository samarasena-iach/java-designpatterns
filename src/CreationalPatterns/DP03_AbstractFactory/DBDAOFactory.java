package CreationalPatterns.DP03_AbstractFactory;

public class DBDAOFactory extends DAOAbstractFactory {
    @Override
    public DAO createDAO(String type) {
        DAO dao = null;

        if (type.equals("emp")) {
            return new DBEmpDAO();
        } else if (type.equals("dept")) {
            return new DBDeptDAO();
        }

        return dao;
    }
}
