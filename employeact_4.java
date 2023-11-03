class employee{
    String EmpName;
    int EmpID;
    double EmpSal;
    String DOJ;
}
class employeact_4{
    public static void main(String[] args) {
        employee e1=new employee();
        e1.EmpName="abdul";
        e1.EmpID=101;
        e1.EmpSal=40000.00;
        e1.DOJ="20/08/2001";
        System.out.println(e1.EmpName+"\n"+e1.EmpID+"\n"+e1.EmpSal+"\n"+e1.DOJ);
    }
}