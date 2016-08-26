package Hospital;
 
public class Data {
    int num;
    String ddata;
    String ndata;
    
    Data(int num, String ddata, String ndata) {
        this.num=num;
        this.ddata=ddata;
        this.ndata=ndata;
    }
    void display(Readable read) {
        if (read instanceof Doctor) {
            System.out.println(this.ddata);
        } else if (read instanceof Nurse) {
            System.out.println(this.ndata);
        } else {
            System.out.println("권한이 없습니다.");
        }
    }
}