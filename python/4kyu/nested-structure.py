def same_structure_as(original,other):
    #your code here
    if not check_same_struct(original, other):
        return False
    value_1 = value_of_list(original)
    value_2 = value_of_list(other)
    return value_1 == value_2


def check_same_struct(obj_1, obj_2):
    if isinstance(obj_1, dict):
        return False
    if isinstance(obj_2, dict):
        return False
    return True

def value_of_list(array):
    if check_if_int(array):
       return array

    counting_list = []
    SINGULAR_ELEMENT = 1
    
    for item in array:
        try:
            iter(item)
        except TypeError:
            counting_list.append(SINGULAR_ELEMENT)
        else:
            if empty(item):
                counting_list.append(SINGULAR_ELEMENT)
            counting_list.append(len(item))
    return counting_list

def empty(seq):
    if isinstance(seq, str):
        return False
    try:
        return all(map(empty,seq))
    except TypeError:
        return False

def check_if_int(value):
    try:
        int(value)
    except TypeError:
        return False
    else:
        return True