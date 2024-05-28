class Account {
    String acNo;
    String accName;
    String accType;

    public Account (String acNo , String accName , String accType){
        this.acNo = acNo;
        this.accName = accName;
        this.accType = accType;
    }

}

class Employee {
    private int eid;
    private String ename;
    private String adress;
    private Account account;

    public Employee(int eid, String ename, String adress, Account account)
    {
        this.eid = eid;
        this.ename = ename;
        this.adress = adress;
        this.account = account;
    }

    public void getEmployeeDetayls(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(adress);
        System.out.println(account.acNo);
        System.out.println(account.accName);
        System.out.println(account.accType);
    }

    public static void main(String[] args) {
        Account account = new Account("ABC123" , "ALin" , "Temporary");
        Employee employee = new Employee(123 , "Alin" , "CeadarLunga" , account);
        employee.getEmployeeDetayls();

    }
}