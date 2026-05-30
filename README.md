# Program Perhitungan Gaji Karyawan

Program Java sederhana untuk menghitung total gaji karyawan berdasarkan golongan dan jumlah jam lembur.

Program ini menggunakan:

- Operator aritmatika
- Percabangan `if`, `else if`, dan `else`
- Array untuk menyimpan gaji pokok
- Array untuk menyimpan persen lembur
- Validasi input sederhana

## Ketentuan Gaji Pokok

Gaji pokok disimpan dalam array:

```java
int[] gaji = {5000000, 6500000, 9500000};
```

| Golongan | Index Array | Gaji Pokok |
| --- | ---: | ---: |
| A | 0 | Rp5.000.000 |
| B | 1 | Rp6.500.000 |
| C | 2 | Rp9.500.000 |

## Ketentuan Persen Lembur

Persen lembur disimpan dalam array:

```java
int[] persenLembur = {30, 32, 34, 36, 38};
```

| Jam Lembur | Index Array | Persen Lembur |
| ---: | ---: | ---: |
| 1 jam | 0 | 30% |
| 2 jam | 1 | 32% |
| 3 jam | 2 | 34% |
| 4 jam | 3 | 36% |
| >= 5 jam | 4 | 38% |

## Rumus Perhitungan

```text
gaji lembur = jam lembur x persen lembur x gaji pokok
total gaji  = gaji pokok + gaji lembur
```

Contoh:

```text
Golongan B
Jam lembur 2

Gaji pokok  = Rp6.500.000
Lembur      = 2 x 32% x Rp6.500.000
            = Rp4.160.000
Total gaji  = Rp10.660.000
```

## Cara Menjalankan Program

Compile program:

```powershell
javac Main.java
```

Jalankan program:

```powershell
java Main
```

## Contoh Output

```text
Masukkan golongan karyawan (A/B/C): B
Masukkan jumlah jam lembur: 2

Golongan       : B
Gaji pokok     : Rp6.500.000,00
Jam lembur     : 2 jam
Persen lembur  : 32%
Gaji lembur    : Rp4.160.000,00
Total gaji     : Rp10.660.000,00
```

## Validasi Input

Jika golongan tidak valid:

```text
Golongan tidak valid. Pilih A, B, atau C.
```

Jika jam lembur bukan angka:

```text
Jam lembur harus berupa angka.
```

Jika jam lembur bernilai negatif:

```text
Jam lembur tidak boleh bernilai negatif.
```
