from math import sqrt

def is_prime(num):
  divisor = 2
  while divisor <= sqrt(abs(num)):
      if num % divisor == 0:
          return False
      divisor += 1
  return not (num == 0 or num == 1 or num == -1)