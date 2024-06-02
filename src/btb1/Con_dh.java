package btb1;

public class Con_dh {
    private int chuyengiosangphut;
    private int chuyenngaysangphut;

    public Con_dh(int chuyengiosangphut,int chuyenngaysangphut) {
        this.chuyengiosangphut = chuyengiosangphut;
        this.chuyenngaysangphut = chuyenngaysangphut;
    }  

    //Chuyen gio sang phut 
    public int GIOSANGPHUT(int x ){
        return this.chuyengiosangphut * 60 ; 
    }

    public int NGAYSANGPHUT (int x ){
        return this.chuyenngaysangphut * 24 * 60;
    }
}