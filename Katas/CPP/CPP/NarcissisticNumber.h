#pragma once
#include<iostream>
#include<math.h>
#include<string>
using namespace std;
bool narcissistic(int value) {
    int sum = 0;
    int _value = value;
    int count = to_string(_value).size();
    while (_value > 0) {
        sum += pow(_value % 10, count);
        _value = _value / 10;
    }
    cout << "Original number " << value << ". Powered number " << sum << "\n";
    return sum == value;
}