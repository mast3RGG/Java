class Branch {
    private int bid;
    private String bName;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
}

class Student {
    private String sId;
    private String sName;
    private String sAdrs;
    private Branch branch;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAdrs() {
        return sAdrs;
    }

    public void setsAdrs(String sAdrs) {
        this.sAdrs = sAdrs;
    }

    public void setBranch(Branch branch){
        this.branch = branch;
    }

    public Branch getBranch()
    {
        return branch;
    }
}

public class MantToOneAssociation {
    public static void main(String[] args) {
        Branch branch = new Branch();
        branch.setBid(1);
        branch.setbName("iNeuron");

        Student s1 = new Student();
        s1.setsId("123");
        s1.setsName("Alin");
        s1.setsAdrs("Eugeniu");
        s1.setBranch(branch);

        Student s2 = new Student();
        s2.setsId("223");
        s2.setsName("Maxim");
        s2.setsAdrs("Eugeniu");
        s2.setBranch(branch);

        Student s3 = new Student();
        s3.setsId("323");
        s3.setsName("Adrian");
        s3.setsAdrs("Eugeniu");
        s3.setBranch(branch);

        System.out.println("Stundent details");
        System.out.println();
        System.out.println(s1.getsName());
        System.out.println(s1.getsAdrs());
        System.out.println(s1.getsId());
        System.out.println(s1.getBranch().getBid());
        System.out.println(s1.getBranch().getbName());
        System.out.println("====================");
        System.out.println(s2.getsName());
        System.out.println(s2.getsAdrs());
        System.out.println(s2.getsId());
        System.out.println(s2.getBranch().getBid());
        System.out.println(s2.getBranch().getbName());
        System.out.println("====================");
        System.out.println(s3.getsName());
        System.out.println(s3.getsAdrs());
        System.out.println(s3.getsId());
        System.out.println(s3.getBranch().getBid());
        System.out.println(s3.getBranch().getbName());
        System.out.println("====================");

    }
}
