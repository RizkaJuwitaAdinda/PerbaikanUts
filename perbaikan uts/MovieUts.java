public class Movie {
    public static Object bubbleSort;
    int id;
    String judul;
    int tahun;
    float rating;

    Movie(int i, String j, int t, float r) {
        id = i;
        judul = j;
        tahun = t;
        rating = r;
    }

    void tampil() {
        System.out.println("ID = " + id);
        System.out.println("Judul = " + judul);
        System.out.println("Tahun = " + tahun);
        System.out.println("Rating = " + rating);

    }
}

class MovieSearch {
    Movie listMovie[];
    int idx;

    void tambah(Movie m) {
        if (idx < listMovie.length) {
            listMovie[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for (Movie m : listMovie) {
            m.tampil();
            System.out.println("-----------------------");
        }
    }

    public int FindSeqSearch(float cari) {
        int posisi = -1;
        for (int j = 0; j < listMovie.length; j++) {
            if (listMovie[j].rating == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(float y, int pos) {
        if (pos != -1) {
            System.out.println("data : " + y + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + y + "tidak ditemukan");
        }

    }

    public void TampilData(float y, int pos) {
        if (pos != -1) {
            System.out.println("Id\t : " + listMovie[pos].id);
            System.out.println("Judul\t : " + listMovie[pos].judul);
            System.out.println("Tahun\t : " + listMovie[pos].tahun);
            System.out.println("Rating\t : " + y);
        } else {
            System.out.println("data " + y + "tidak ditemukan ");
        }
    }

    public void bubbleSort() {
    }
}