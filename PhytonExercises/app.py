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