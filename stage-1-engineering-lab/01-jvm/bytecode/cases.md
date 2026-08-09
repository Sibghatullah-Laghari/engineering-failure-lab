# Case 1 — Inspect a Simple Method
## Problem
Compile add(int,int) and inspect with javap -c. Identify generated instructions.
## What You Know
You can compile and run javap tools on the class.
## Possible Causes
Build/tooling mismatch, unexpected compiler output, or misunderstanding of generated instructions.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson

# Case 2 — Local Variables and Parameters
## Problem
Inspect how method parameters/local variables appear in bytecode.
## What You Know
Method works at source level but low-level layout is unclear.
## Possible Causes
Slot mapping confusion, variable lifetime assumptions, or index interpretation errors.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson

# Case 3 — Method Invocation
## Problem
Compare static and instance method bytecode and investigate invocation differences.
## What You Know
Behavior is correct but invocation details differ.
## Possible Causes
Different invoke instructions, receiver handling differences, or call-site assumptions.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson

# Case 4 — Different Source, Similar Behavior
## Problem
Implement logically equivalent code in two ways and compare bytecode.
## What You Know
Two source versions return equivalent outputs.
## Possible Causes
Compiler optimization differences, structure differences, or generated flow variations.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson

# Case 5 — Compiler-Generated Structures
## Problem
Use a Java language feature that produces compiler-generated structures and inspect the class file with javap.
## What You Know
Source code appears simple, class file includes additional artifacts.
## Possible Causes
Synthetic structures, compiler-generated helpers, or feature desugaring effects.
## What Should I Check?

## Investigation Path

## Possible Fix Directions

## Verification

## Engineering Questions

## My Investigation

## Evidence Collected

## Hypotheses Tested

## Root Cause

## Fix

## Verification Result

## Engineering Lesson
