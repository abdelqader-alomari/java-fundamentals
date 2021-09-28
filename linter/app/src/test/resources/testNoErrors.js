function and(a, b) {
    if (a === 1 && b === 1) {
        return 1;
    } else {
        return 0;
    }
}

function or(a, b) {
    if (a === 1)
        return 1;
    if (b === 1)
        return 1;
    else
        return 0;
}

console.log("and 00", and(0, 0));
console.log("and 01", and(0, 1));

console.log("or 00", or(0, 0));
console.log("or 01", or(0, 1));
