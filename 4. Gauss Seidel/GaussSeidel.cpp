// Author : @Alifferdyansyah
#include<iostream>
#include<conio.h>

using namespace std;

int main(void) {

    float a[10][10], b[10], x[10], y[10];
    int n = 0, m = 0, i = 0, j = 0;

    cout << "Masukkan ukuran array 2 dimensi : ";
    cin >> n;

    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {

            cout << "Masukkan nilai :(" << i << ", " << j << ") ";
            cin >> a[i][j];

        }

    }
    cout << "\nMasukkan nilai ruas di sebelah kanan : \n";
    for (i = 0; i < n; i++) {

        cout << "Masukkan nilai :(" << i << ", " << j << ") ";
        cin >> b[i];
    }
    cout << "Masukkan nilai awal x\n";
    for (i = 0; i < n; i++) {
        cout << "Masukkan nilai :(" << i<<"):";
        cin >> x[i];
    }
    cout << "\nMenentukan Iterasi ke : ";
    cin >> m;
    while (m > 0) {
        for (i = 0; i < n; i++) {
            y[i] = (b[i] / a[i][i]);
            for (j = 0; j < n; j++) {
                if (j == i)
                    continue;
                y[i] = y[i] - ((a[i][j] / a[i][i]) * x[j]);
                x[i] = y[i];
            }
            printf("x%d = %f    ", i + 1, y[i]);
        }
        cout << "\n";
        m--;
    }
    return 0;
}