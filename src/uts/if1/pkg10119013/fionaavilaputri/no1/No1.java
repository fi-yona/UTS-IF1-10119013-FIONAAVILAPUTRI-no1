/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package uts.if1.pkg10119013.fionaavilaputri.no1;

/**
 *
 * @author Fiona Avila
 */



public class No1 {
    
    private int yearBirth;
    private int yearNow = 2020;
    private final String red = "\u001b[31m";
    
    public void Age(int yearNow){
        this.yearNow = yearNow;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow-yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        String keterangan = null;
        if(0<=umur && umur<=5){
            keterangan = (red + "LAGI LUCU-LUCUNYA");
        }if(5<=umur && umur<=10){
            keterangan = ( red +"MASIH ANAK-ANAK");
        }if(10<=umur && umur<=13){
            keterangan = (red + "MASIH REMADJA");
        }if(13<=umur && umur<=19){
            keterangan = (red + "ALAY");
        }if(19<=umur && umur<=29){
            keterangan = (red + "LAGI GALAU NYARI JODOH");
        }if(29<=umur && umur<=35){
            keterangan = (red + "LAGI SIBUK NYARI UANG");
        }if(35<=umur && umur<=150){
            keterangan = (red + "SUDAH TUA");
        }if(0>umur && umur>150){
            keterangan = (red + "TIDAK TERDETEKSI DI KEHIDUPAN");
        }
        return keterangan;
    }
}
