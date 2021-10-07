function and(a, b) {
    if (a === 1 && b === 1) {
        return 1;
    } else {
        return 0;
    }
}

function or(a, b) {
    if (a === 1)
        return 1
    if (b === 1)
        return 1;
    else
        return 0;
}

function xor(a, b) {
    if (and(a, b))
        return 0
    return or(a, b);
}

function not(a) {
    if (a === 0)
        return 1;
    else
        return 0
}
console.log("and1 010", and1(0, 1, 0));
console.log("or1 010", or1(0, 1, 0));
console.log("xor1 010", xor1(0, 1, 0));
console.log("not1 010", not1(0, 1, 0))
