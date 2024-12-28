// #include <iostream>
// #include <algorithm>
// #include <string>
// void swap(char &a, char &b)
// {
//     char temp = a;
//     a = b;
//     b = temp;
// }
// int part(std::string &str, int low, int high)
// {
//     char pivot = str[high];
//     int i = low - 1;
//     for (int j = low; j < high; j++)
//     {
//         if (str[j] <= pivot)
//         {
//             i++;
//             swap(str[i], str[j]);
//         }
//     }
//         swap(str[i + 1], str[high]);
//         return (i + 1);
// }
// void quicksort(std::string &str, int low, int high)
// {
//     if (low < high)
//     {
//         int pi = part(str, low, high);

//         quicksort(str, low, pi - 1);
//         quicksort(str, pi + 1, high);
//     }
// }
// int main()
// {
//     std::string input;
//     std::cout << "Enter a string";
//     std::getline(std::cin, input);

//     quicksort(input, 0, input.length() - 1);

// }
