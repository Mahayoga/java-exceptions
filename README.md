# Java Exception

1. Exceptions1 Java File

    Di dalam file ini, berisi sebuah array yang di deklarasikan di awal sebuah program. Array ini digunakan nantinya sebagai contoh error dari ArrayIndexOutOfBoundsException:

    > ```int[] arr = {1, 2, 3, 4, 5};```

    Pertama kita menulis blok kode di dalam try-catch yang nantinya berfungsi sebagai menangkap error.

    > `try {`
    >
    > `} catch() {`
    >
    > `}`

    Kedua kita ambil isi dari variabel `arr` tadi dengan indeks `5` dengan menampilkan output dengan kode `System.out.println`

    > ```try {```
    > ```Systm.out.println(arr[5]);```
    > ```} catch() {```
    > ``` ```
    > ```}```

    Ketiga kita mengisi Exception dengan nama objek `e` didalam kurung `catch` dan memberi output di dalam blok kode `catch`

    > ```try {```
    > ```Systm.out.println(arr[5]);```
    > ```} catch(Exception e) {```
    > ```e.printStackTrace()```
    > ```}```

    Hasilnya adalah, awalnya variabel array yang bernama `arr` dideklarasikan dengan panjang nilai `5` dan diberikan nilai di setiap panjang nya. Kemudian di dalam blok kode `try-catch`, kita akan meng-outputkan variabel `arr` tadi, dengan indeks `5`.
    
    Yang terjadi adalah java akan melempar error berupa `ArrayIndexOutOfBoundsException` yang artinya adalah nilai pada indeks `5` tidak ada atau tidak di deklarasikan di awal pendeklarasian.

    Mengapa? memang benar kita mendeklarasikan variabel `arr` tadi dengan panjang `5` nilai atau item. Tetapi komputer mengitung nilai tersebut dari nol. Maka, jika kita mau mengambil nilai paling akhir dari variabel `arr` tadi, maka kode yang tepat adalah:

    > `System.out.println(arr[4]);`

    Karena komputer memulai nya dengan indeks `0`

2. Excepions2 Java File
    Pada file yang kedua kali ini, adalah bagaimana contoh error dari `ArithmeticException`

    Pertama adalah membuat variabel `int` dengan nama `a` yang akan diisi dengan nilai `9 / 0`.

    > `int a = 9 / 0;`

    kedua Lalu kita memasukan variabel `a` kedalam try-catch seperti ini

    >`try {`
    >`    int a = 9 / 0;`
    >`} catch(Exception e) {`
    > ` e.printStackTrace();`
    > `}`
    

    Ketiga kita ambil isi dari variabel `a` tadi dengan nilai `9 / 0` dengan menampilkan output dengan kode `System.out.println`

    >`try {`
    >    `int a = 9 / 0;`
    >    `System.out.println(a);`
    >`} catch()`