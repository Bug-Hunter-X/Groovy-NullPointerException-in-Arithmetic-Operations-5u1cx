# Groovy NullPointerException in Arithmetic Operations

This repository demonstrates a subtle bug in Groovy related to null values and arithmetic operations. The issue arises from Groovy's flexible typing system, which can lead to unexpected behavior when dealing with null values within expressions.

## The Bug

The `myMethod` function attempts to handle null values as inputs. However, the simple null check isn't sufficient to prevent a potential `NullPointerException` if either `a` or `b` is null and the code attempts an arithmetic operation. 

## The Solution

The solution ensures that the inputs are checked appropriately before performing the addition. This involves explicit type checking and handling to mitigate potential errors.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe the output and the potential issues.
4. Run `bugSolution.groovy` to see the corrected implementation.
