package P3.Tugas;

public class DataDosen11 {
    
    public void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        System.out.println("\n======= DATA SELURUH DOSEN =======");
        for (Dosen11 dsn : arrayOfDosen) {
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("-----------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen11 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;
        for (Dosen11 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                jmlWanita++;
            }
        }
        System.out.println("Rerata Usia Pria   : " + (jmlPria > 0 ? (double) totalUsiaPria/jmlPria : 0));
        System.out.println("Rerata Usia Wanita : " + (jmlWanita > 0 ? (double) totalUsiaWanita/jmlWanita : 0));
    }

    public void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        Dosen11 palingTua = arrayOfDosen[0];
        for (Dosen11 dsn : arrayOfDosen) {
            if (dsn.usia > palingTua.usia) palingTua = dsn;
        }
        System.out.println("Dosen Paling Tua: " + palingTua.nama + " (" + palingTua.usia + " thn)");
    }

    public void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        Dosen11 palingMuda = arrayOfDosen[0];
        for (Dosen11 dsn : arrayOfDosen) {
            if (dsn.usia < palingMuda.usia) palingMuda = dsn;
        }
        System.out.println("Dosen Paling Muda: " + palingMuda.nama + " (" + palingMuda.usia + " thn)");
    }
}