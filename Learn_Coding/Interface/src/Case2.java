interface ICase1
{
    void m1();
}

interface ICase2{
    void m2();
}

interface ICase3 extends ICase1,ICase2
{
    void m3();
}

class SampleImpl implements  ICase3
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
