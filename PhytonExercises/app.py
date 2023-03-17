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