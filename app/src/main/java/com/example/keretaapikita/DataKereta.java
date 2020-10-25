package com.example.keretaapikita;

import java.util.ArrayList;

public class DataKereta {
    private static String[] namaKereta = {
            "Argo Wilis",
            "Argo Bromo Anggrek",
            "Malabar",
            "Lodaya",
            "Ranggajati",
            "Mutiara Timur",
            "Singasari",
            "Tawang Jaya Premium",
            "Kertajaya",
            "Pasundan"
    };

    private static String[] detailKereta = {
            "Kereta api Argo Wilis merupakan layanan kereta api penumpang kelas eksekutif yang dioperasikan oleh PT Kereta Api Indonesia (Persero) untuk melayani lintas Gambir – Surabaya Gubeng melalui Bandung – Yogyakarta dan sebaliknya. Kereta api yang mulai beroperasi pada 8 November 1998 ini menempuh perjalanan sejauh 865 km dalam waktu sekitar 16 jam. Awalnya, kereta api ini beroperasi menggunakan rangkaian kereta buatan PT. INKA keluaran 1998. Sejak 8 Juni 2018, kereta api Argo Wilis beroperasi menggunakan rangkaian kereta baja nirkarat buatan PT INKA keluaran 2018 maupun 2019 beserta kereta makan dan kereta pembangkit.",
            "Kereta api Argo Bromo Anggrek, juga disebut Argo Anggrek, merupakan layanan kereta api penumpang kelas eksekutif dan luxury yang dioperasikan oleh PT Kereta Api Indonesia (Persero) untuk melayani lintas Surabaya Pasarturi – Gambir dan sebaliknya. Kereta api yang diluncurkan pada 24 September 1997 ini merupakan salah satu kereta api unggulan karena pernah beroperasi menggunaan rangkaian kereta berbogie CL243 bolsterless (K9) pada awal pengoperasiannya. Kereta api ini menempuh jarak sejauh 725 km dalam waktu sekitar 9 jam 15 menit.Kereta api Argo Bromo Anggrek melayani kelas luxury sejak 12 Juni 2018. Rangkaian kereta kelas eksekutif baja nirkarat buatan PT INKA mulai dipakai untuk pengoperasian kereta api ini pada 2019, sementara rangkaian kereta buatan tahun 1997 dan 2001 dialihkan ke Dipo Kereta Semarang Poncol (SMC) untuk pengoperasian kereta api Argo Sindoro dan Argo Muria. ",
            "Kereta api Malabar merupakan layanan kereta api penumpang kelas eksekutif, bisnis, dan ekonomi yang dioperasikan oleh PT Kereta Api Indonesia (Persero) untuk melayani lintas Malang–Pasar Senen melalui Blitar – Yogyakarta – Bandung dan sebaliknya. Kereta api Malabar merupakan satu-satunya kereta api yang memiliki semua layanan kelas dalam satu rangkaian kereta. Kereta api Malabar pertama kali beroperasi pada 30 April 2010 dengan awal rute Bandung–Malang untuk melayani penumpang dari Malang dan sekitarnya yang melakukan perjalanan dari dan menuju Bandung dan sebaliknya karena saat itu belum ada satu kereta pun yang melayani lintas tersebut.",
            "Kereta api Lodaya merupakan layanan kereta api penumpang kelas eksekutif dan ekonomi premium (reguler) yang dioperasikan oleh PT Kereta Api Indonesia (Persero), melayani lintas Solo Balapan – Bandung dan sebaliknya. Kereta api ini menawarkan perjalanan sebanyak dua kali (pagi dan malam) perjalanan pulang-pergi. Kereta api Lodaya beroperasi menggunakan rangkaian kereta baja nirkarat buatan PT INKA mulai 2018 dengan layanan kelas eksekutif dan ekonomi premium. ",
            "Kereta api Ranggajati merupakan layanan kereta api kelas eksekutif dan bisnis yang dioperasikan oleh PT Kereta Api Indonesia untuk melayani lintas Cirebon–Jember melalui Yogyakarta – Surabaya Gubeng dan sebaliknya. Kereta api yang mulai beroperasi pada 1 November 2016 ini menempuh jarak sejauh 800 km dalam waktu rata-rata 15 jam 17 menit. Dalam pengoperasiannya, kereta ini membawa 5 kereta eksekutif, 1 kereta makan, 4 kereta bisnis dan satu kereta pembangkit.",
            "Kereta api Mutiara Timur merupakan layanan kereta api penumpang kelas eksekutif dan ekonomi premium yang dioperasikan oleh PT Kereta Api Indonesia untuk melayani lintas Ketapang – Surabaya Gubeng/Pasarturi dan sebaliknya. Kereta api ini menempuh jarak 305 km hingga 313 km dalam waktu kurang dari 7 jam. Kereta api Mutiara Timur pertama kali beroperasi pada sekitar 1972 dengan layanan kelas ekonomi dan bisnis. Mulai 1996, kereta api ini sempat mengalami perubahan layanan kelas menjadi kelas bisnis dan eksekutif. Mulai 15 Desember 2018, kereta api ini beroperasi menggunakan rangkaian kereta baja nirkarat buatan PT INKA dengan layanan kelas eksekutif dan ekonomi premium.",
            "Kereta api Singasari merupakan layanan kereta api penumpang kelas eksekutif dan ekonomi plus milik PT Kereta Api Indonesia untuk melayani lintas Blitar – Pasar Senen lewat Yogyakarta dan sebaliknya. Kereta api Singasari merupakan hasil pemangkasan lintas pelayanan pada kereta api Krakatau—melayani lintas Blitar–Merak—pada 17 Juli 2017 karena okupansi penumpang yang rendah pada ruas Pasar Senen–Merak serta untuk optimalisasi rangkaian kereta. Pada awal pengoperasian, kereta api ini hanya melayani kelas ekonomi plus seperti pendahulunya, namun layanan kereta api ditambah dengan menambahkan layanan kelas eksekutif mulai 1 November 2018. ",
            "Kereta api Tawang Jaya merupakan dua layanan kereta api penumpang yang dioperasikan PT Kereta Api Indonesia untuk melayani lintas Semarang – Jakarta dan sebaliknya. Kedua layanan kereta api yang dioperasikan, yaitu Tawang Jaya (kelas ekonomi lintas Semarang Poncol–Pasar Senen) dan Tawang Jaya Premium (kelas ekonomi premium lintas Semarang Tawang–Pasar Senen). Mulai 4 April 2016, kereta api Tawang Jaya beroperasi dengan rangkaian kereta panjang—terdiri dari 14 kereta kelas ekonomi, 1 unit kereta makan pembangkit, 1 kereta pembangkit, serta lokomotif CC206 sebagai bakal pelanting. Sementara Kereta api Tawang Jaya Premium sempat beroperasi menggunakan rangkaian kereta kelas ekonomi premium berbahan baja nirkarat keluaran 2018, sebelum diganti dengan rangkaian kereta kelas ekonomi premium keluaran 2017.",
            "Kereta api Kertajaya merupakan layanan kereta api penumpang kelas ekonomi premium (reguler) yang dioperasikan oleh PT Kereta Api Indonesia (Persero) untuk melayani lintas Surabaya Pasarturi – Pasar Senen dan sebaliknya. Mulai 2019, rangkaian kereta baja nirkarat kelas ekonomi premium buatan PT INKA keluaran 2019 digunakan untuk pengoperasian kereta api Kertajaya. Sesuai dengan grafik perjalanan kereta api (gapeka) 2019, rangkaian kereta ini memiliki masa istirahat yang cukup lama di Stasiun Surabaya Pasarturi sehingga rangkaian keretanya digunakan untuk pengoperasian kereta api Maharani pada pagi hari. ",
            "Kereta api Pasundan merupakan kereta api penumpang kelas ekonomi yang dioperasikan oleh PT Kereta Api Indonesia untuk melayani lintas Kiaracondong - Surabaya Gubeng lewat Lempuyangan dan sebaliknya. Nama Pasundan berasal dari Tatar Pasundan — suatu wilayah di Jawa Barat maupun Banten yang mayoritas dihuni Suku Sunda yang memiliki kearifan lokal Sunda atau Kerajaan Sunda. Dalam pengoperasiannya kereta ini membawa 7 kereta ekonomi dan satu kereta makan pembangkit. Mulai 1 Desember 2019, kereta api Pasundan mengalami perpindahan operasional yang sebelumnya Daerah Operasi VIII Surabaya menjadi Daerah Operasi II Bandung."
    };

    private static String[] tarifKereta = {
            "Tarif kereta api ini berkisar antara Rp230.000,00 – Rp1.050.000,00 tergantung pada layanan kelas, jarak tempuh, subkelas/posisi tempat duduk dalam rangkaian kereta yang dapat sebelum hari keberangkatan. Adapun tarif kereta api untuk lintas Jakarta–Bandung ditetapkan sebesar Rp150.000,00. Pada hari-hari tertentu seperti akhir pekan dan libur nasional akan ditambahkan layanan kereta priority/imperial. Selain itu, terdapat tarif khusus yang berlaku dua jam sebelum keberangkatan seperti Surabaya – Jombang : Rp40.000,00, Surabaya / Yogyakarta – Madiun : Rp100.000,00, Surabaya – Yogyakarta : Rp230.000,00, Jombang / Solo – Madiun : Rp70.000,00, Yogyakarta / Tasikmalaya – Kroya : Rp110.000,00, Banjar – Bandung : Rp90.000,00 dan Tasikmalaya – Bandung : Rp80.000,00",
            "Tarif kereta api ini berkisar antara Rp270.000,00 – Rp980.000,00 untuk kelas eksekutif dan Rp700.000,00 – Rp2.000.000,00 untuk kelas luxury, bergantung pada jarak yang ditempuh penumpang, subkelas, serta hari-hari tertentu seperti akhir pekan dan libur nasional. Selain itu, berlaku pula tarif khusus untuk kelas eksekutif yang hanya dapat dipesan mulai dua jam sebelum keberangkatan pada dalam lintas Surabaya – Semarang maupun sebaliknya : Rp210.000,00 dan Cirebon – Jakarta maupun sebaliknya : Rp165.000,00",
            "Tarif kereta api ini berkisar antara Rp375.000,00 – Rp600.000,00 untuk kelas eksekutif, Rp300.000,00 – Rp500.000,00 untuk kelas bisnis, dan Rp225.000,00 – Rp340.000,00 untuk kelas ekonomi tergantung pada jarak tempuh, subkelas/posisi tempat duduk dalam rangkaian kereta, serta hari-hari tertentu seperti akhir pekan dan libur nasional yang dapat dipesan sebelum hari keberangkatan.",
            "Tarif kereta api ini berkisar antara Rp180.000,00 - Rp280.000,00 untuk kelas ekonomi dan 270.000 - 430.000 untuk kelas eksekutif tergantung pada jarak yang ditempuh penumpang, subkelas, ataupun hari-hari tertentu seperti akhir pekan dan libur nasional.",
            "Tarif kereta api ini berkisar antara Rp200.000,00 – Rp750.000,00 untuk kelas eksekutif dan Rp140.000,00 – Rp650.000,00 untuk kelas bisnis tergantung pada jarak yang ditempuh penumpang, subkelas, ataupun hari-hari tertentu seperti akhir pekan dan libur nasional. Selain itu, terdapat juga tarif khusus yang hanya dapat dipesan mulai dua jam sebelum keberangkatan pada lintas Cirebon – Purwokerto maupun sebaliknya: Rp65.000,00 (eksekutif) dan Rp45.000,00 (bisnis), Purwokerto – Yogyakarta maupun sebaliknya: Rp110.000,00 (eksekutif) dan Rp90.000,00 (bisnis) dan Surabaya–Madiun/Jember maupun sebaliknya: Rp100.000,00 (eksekutif) dan Rp80.000,00 (bisnis).",
            "Tarif kereta api ini berkisar antara Rp90.000,00 - Rp400.000,00 untuk kelas eksekutif dan Rp50.000,00 - Rp290.000,00 untuk kelas ekonomi premium bergantung pada jarak yang ditempuh penumpang, subkelas, ataupun hari-hari tertentu seperti akhir pekan dan libur nasional. Selain itu, berlaku pula tarif khusus untuk lintas Jember-Ketapang dan Probolinggo - Surabaya maupun sebaliknya yang dapat dipesan tiketnya mulai dua jam sebelum keberangkatan dengan besaran tarif Rp35.000,00 untuk kelas ekonomi premium dan Rp65.000,00 untuk kelas eksekutif. ",
            "Tarif kereta api ini berkisar antara Rp245.000,00 – Rp410.000,00 tergantung pada layanan kelas, jarak yang ditempuh penumpang, serta hari-hari tertentu seperti akhir pekan dan libur nasional. Selain itu, berlaku pula tarif khusus yang hanya dapat dipesan mulai dua jam sebelum keberangkatan pada stasiun-stasiun yang berada di dalam lintas Blitar / Solo – Madiun : Rp40.000,00 (ekonomi plus) dan Rp70.000,00 (eksekutif), Kediri – Yogyakarta : Rp100.000,00 (ekonomi plus) dan Rp150.000,00 (eksekutif), Cirebon – Jakarta : Rp105.000,00 (ekonomi plus) dan Rp165.000,00 (eksekutif) dan Bekasi – Jakarta : Rp20.000,00 (ekonomi plus) dan Rp30.000,00 (eksekutif)",
            "Tarif kereta api ini berkisar antara Rp105.000,00 – Rp140.000,00 untuk kelas ekonomi dan Rp190.000,00 – Rp 300.000,00 untuk kelas ekonomi premium, bergantung pada jarak tempuh, subkelas/posisi tempat duduk di dalam kereta, serta hari-hari tertentu seperti akhir pekan dan libur nasional. Berlaku tarif khusus yang hanya dapat dipesan mulai dua jam sebelum keberangkatan kereta api ini pada stasiun yang berada dalam lintas Semarang – Tegal maupun sebaliknya: Rp65.000,00 dan Bekasi – Jakarta maupun sebaliknya: Rp20.000,00.",
            "Tarif kereta api ini berkisar antara Rp175.000,00 – Rp300.000,00 bergantung pada jarak tempuh, subkelas/posisi tempat duduk di dalam kereta, serta hari-hari tertentu seperti akhir pekan dan libur nasional. Selain itu, berlaku pula tarif khusus yang hanya dapat dipesan mulai dua jam sebelum keberangkatan kereta api ini pada stasiun yang berada dalam lintas Surabaya – Cepu maupun sebaliknya Rp65.000,00 dan Bekasi – Jakarta : Rp20.000,00. ",
            "Mulai 2 Januari 2020, tarif kereta api ini berkisar antara Rp105.000,00 – Rp170.000,00 tergantung pada jarak yang ditempuh penumpang."
    };

    private static int[] fotoKereta = {
            R.drawable.argo_wilis,
            R.drawable.argo_bromo_anggrek,
            R.drawable.malabar,
            R.drawable.lodaya,
            R.drawable.ranggajati,
            R.drawable.mutiara_timur,
            R.drawable.singasari,
            R.drawable.tawang_jaya,
            R.drawable.kertajaya,
            R.drawable.pasundan
    };

    static ArrayList<Kereta> getListKereta() {
        ArrayList<Kereta> list = new ArrayList<>();
        for(int pos = 0; pos < namaKereta.length; pos++) {
            Kereta kereta = new Kereta();
            kereta.setNama(namaKereta[pos]);
            kereta.setDetail(detailKereta[pos]);
            kereta.setTarif(tarifKereta[pos]);
            kereta.setFoto(fotoKereta[pos]);

            list.add(kereta);
        }
        return list;
    };
}
