import re

text = 'Adorei o produto! Super recomendo 😍'


def tokens(text):
    return re.sub(r'[^\w\s]', '', text).lower().split()


print(tokens(text))