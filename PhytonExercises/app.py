# this class is for the questions
class Questions:

    # Question 0 (Question given in class)
    def largest_number(numbers):
        largest_number = numbers[0]
        for i in numbers:
            if i > largest_number:
                largest_number = i
        return largest_number
    print("Question 0")
    print(largest_number([45,34,5,34,6,346,34,6,457]))

    # 1. Write a function that takes a list of integers as input
    # and returns a new list with all the even numbers doubled
    # and all the odd numbers replaced with -1.
    def new_list(numbers1):
        new = []
        for i in numbers1:
            if i % 2 == 0:
                new.append(i * 2)
            else:
                new.append(-1)
        return new
    print("Question 1")
    print(new_list([45,34,5,34,6,346,34,6,457]))

    #2. Write a function that takes a string as input and
    #  returns a new string with all the vowels removed.
    def vowelless(string_input):
        vowels = ('a', 'e', 'i', 'o', 'u')
        for i in string_input.lower():
            if i in vowels:
                string_input = string_input.replace(i,"")
        return string_input
    print("Question 2")
    print(vowelless("try making THIS SENTENCE vowelless"))

    #3. Write a function that takes a list of strings as input and
    # returns a new list with all the strings that have a length of 4 or greater.
    def four_strings(list_of_strings):
        new_string = []
        for i in list_of_strings:
            if len(i) >= 4:
                new_string.append(i)
        return new_string
    print("Question 3")
    print(four_strings(["C#", "C++", "Python", "Java"]))

    #4. Write a function that takes a list of integers as input and returns
    # the largest difference between any two adjacent numbers.
    def largest_difference(numbers2):
        max_diff = 0
        for i in range(len(numbers2)):
            for j in range(i + 1, len(numbers2)):
                if (abs(numbers2[i] - numbers2[j])) > max_diff:
                    max_diff = abs(numbers2[i] - numbers2[j])
        return max_diff
    print("Question 4")
    print(largest_difference([45,34,5,34,6,346,34,6,457]))

    # 5. Write a function that takes a list of integers as input and
    # returns the second largest number in the list.
    def second_largest_number(numbers3):
        largest = 0
        second = 0
        for i in numbers3:
            if i > largest:
                second = largest
                largest = i
            elif i > second:
                second = i
        return second

    print("Question 5")
    print(second_largest_number([45, 34, 5, 34, 6, 346, 34, 6, 457]))

    #6. Write a function that takes a string as input and returns True if
    # the string is a palindrome and False otherwise.
    def check_palindrome(string_input1):
        x = len(string_input1)
        for i in range(x//2):
            if (string_input1[i] != string_input1[x-i-1]):
                return False
        return True

    print("Question 6")
    print(check_palindrome("hannah"))
    print(check_palindrome("stars"))
    print(check_palindrome("racecar"))

    #7. Write a function that takes a list of strings as input and
    # returns a new list with all the strings in reverse order.
    def reverse_strings(list_of_strings2):
        new_string1 = []
        for i in list_of_strings2:
            new_string1.append(i [::-1])
    # i used [::-1] because python does not have function to reverse string
        return new_string1

    print("Question 7")
    print(reverse_strings(["C#", "C++", "Python", "Java"]))

    #8. Write a function that takes two lists as input and returns
    # a new list with all the elements that are common to both lists.
    def common_elements(list_input1, list_input2):
        common = []
        for element in list_input1:
            if element in list_input2:
                common.append(element)
        return common

    print("Question 8")
    print(common_elements([1, 2, 3, 4, 5], [5, 5, 7, 3, 2]))
    print(common_elements([1, 2, 3, 4, 5], [6, 7, 8, 9]))

    #9. Write a function that takes a list of integers as input and returns
    # the sum of all the elements in the list that are divisible by 3 or 5.
    def sum_of_multiple3or5(numbers4):
        sum = 0
        for i in numbers4:
            if (i % 3 == 0) or (i % 5 == 0):
                sum += i
        return sum

    print("Question 9")
    print(sum_of_multiple3or5([45, 34, 5, 34, 6, 346, 34, 6, 457]))
    print(sum_of_multiple3or5([40, 30, 5, 34, 6, 7, 34, 7, 457]))
