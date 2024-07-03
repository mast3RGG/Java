interface IAA{
    void m1();
}

interface IBB
{
    void m2();
}

interface ICC extends IAA,IBB{
    void m3();
}

class Implementation implements ICC
{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}