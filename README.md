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
    >
    > ```System.out.println(arr[5]);```
    >
    > ```} catch() {```
    >
    > ```}```

    Ketiga kita mengisi Exception dengan nama objek `e` didalam kurung `catch` dan memberi output di dalam blok kode `catch`

    > ```try {```
    >
    > ```System.out.println(arr[5]);```
    >
    > ```} catch(Exception e) {```
    >
    > ```e.printStackTrace()```
    >
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
    >
    >`    int a = 9 / 0;`
    >
    >`} catch(Exception e) {`
    >
    > `   e.printStackTrace();`
    >
    > `}`
    

    Ketiga kita ambil isi dari variabel `a` tadi dengan nilai `9 / 0` dengan menampilkan output dengan kode `System.out.println`

    > `try {`
    >    `int a = 9 / 0;`
    >
    >    `System.out.println(a);`
    >
    > `} catch(Exception e) {`
    >
    > `   e.printStackTrace();`
    >
    > `}`

    Hasilnya adalah, awalnya variabel `int` yang bernama `a` dideklarasikan dengan panjang nilai hasil dari `9 / 0`. Kemudian di dalam blok kode `try-catch`, kita akan meng-outputkan variabel `a` tadi kedalam console output.
    
    Yang terjadi adalah java akan melempar error berupa `ArithmeticException` yang artinya adalah nilai pada variabel `a` mengalami error karena pembagian dengan `0`.

    Mengapa? Karena kita memang tidak bisa membagi sebuah bilangan dengan nol.

3. Exceptions3 Java File
    Pada di file java yang ketiga ini, adalah contoh bagaimana error dari `InputMismatchException`.

    Pertama adalah membuat objek `Scanner` dengan nama objek `sc`.

    > `Scanner sc = new Scanner(System.in);`

    Kedua, didalam blok kode `try-catch`, Kita akan menanyakan pada user di console untuk memasukkan umur yang nantinya akan di simpan di dalam variabel integer dengan nama `umur` yang cara menerima outputnya adalah dengan objek `Scanner` tadi. Setelah itu menampilkan output umur nya di dalam console.

    > `System.out.print("Masukkan umur kamu: ");`
    >
    > `int umur = sc.nextInt();`
    >
    > `System.out.println("Umur kamu adalah " + umur);`

    Kode di atas adalah kode yang normal atau tidak ada masalah pada struktur kode, tetapi perhatikan bagaimana kita akan mengisi nilai `int` pada variabel `umur` dengan `Scanner`. Jika kita menginputkan huruf yang bertipe data `String` kedalam variabel `int`, maka yang terjadi adalah kita mendapatkan error `InputMismatchException`.

4. Exceptions4 Java File
    Pada di file java yang ketiga ini, adalah contoh bagaimana error dari `NullPointerException`.

    Pertama adalah membuat kode `try-catch` yang nantinya akan diisi variabel wrapper `Integer` dengan nama `a` yang diisi dengan nilai `null`.

    > `Integer a = null;`

    Kedua adalah membuat variabel `int` dengan nama `result` yang akan diisi nilai dari hasil menjalankan method `toInt` yang akan mengembalikan nilai `Integer` ke `int` dan di output kan.

    > `int result = toInt(a);`

    Ketiga adalah membuat method `toInt` yang mempunyai parameter `Integer some` yang nantinya akan mengembalikan nilai `int`

    Lalu yang akan terjadi adalah semenjak kita mengisi variabel `a` dengan `null`, maka yang terjadi adalah akan terjadi error saat menjalankan method `toInt` karena method tersebut mengakses sebuah atribut dari bawaan class `Integer`. karena variabel `a` itu `null`, maka java akan mengembalikan error berupa `NullPointerException`.