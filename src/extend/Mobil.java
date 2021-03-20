package extend;

public class Mobil {
        String Aktifitas;
        String Warna;
        String type;
        int Kecepatan;
        
      void cekkecepatan(){
           if (Kecepatan>=0)
               Aktifitas = "Mobil Jalan";
           if (Kecepatan<=0)        
               Aktifitas = "Mobilnya Rusak";
       }
      void cetakAtribut(){
          System.out.println("Aktifitas = "+ Aktifitas);
          System.out.println("Warna = "+ Warna);
          System.out.println("Kecepatan = "+Kecepatan);
          System.out.println("Type = "+ type);
      }
    }
    