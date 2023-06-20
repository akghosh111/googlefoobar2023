def solution(xs):
    if len(xs) == 1:  
        return str(xs[0])

    
    pos = [x for x in xs if x > 0]
    neg = [x for x in xs if x < 0]

  
    if len(neg) % 2 != 0:
        neg.remove(max(neg))

    if len(neg) == 0 and len(pos) == 0:
        return str(0)


    max_product = 1
    for x in pos + neg:
        max_product *= x

    return str(max_product)
