def validate_pin(pin):
    if not pin.isdigit():
       return False
    return len(pin) == 4 or len(pin) == 6