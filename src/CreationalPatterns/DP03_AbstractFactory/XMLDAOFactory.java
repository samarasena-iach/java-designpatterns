package CreationalPatterns.DP03_AbstractFactory;

public class XMLDAOFactory extends DAOAbstractFactory {
    @Override
    public DAO createDAO(String type) {
        DAO dao = null;

        if (type.equals("emp")) {
            return new XMLEmpDAO();
        } else if (type.equals("dept")) {
            return new XMLDeptDAO();
        }

        return dao;
    }
}
