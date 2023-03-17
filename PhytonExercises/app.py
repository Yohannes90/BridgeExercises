# this class is for the questions
class Questions:

    # Question 0 (Question given in class)c
    def largest_number(numbers):
        largest_number = numbers[0]
        for i in numbers:
            if i > largest_number:
                largest_number = i
        return largest_number
    print(largest_number([45,34,5,34,6,346,34,6,457]))
