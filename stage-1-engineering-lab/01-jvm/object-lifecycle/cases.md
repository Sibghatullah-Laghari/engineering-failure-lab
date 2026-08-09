# Case 1 — Object Creation
## Problem
Investigate what happens around new User(): class availability, allocation, initialization, constructor and reference assignment.
## What You Know
Creation site is known but lifecycle sequence needs validation.
## Possible Causes
Class loading timing, constructor behavior, initialization order, or allocation path differences.
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

# Case 2 — Constructor Failure
## Problem
Constructor throws an exception. Investigate construction sequence, reference assignment and lifecycle consequences.
## What You Know
Failures happen during object construction.
## Possible Causes
Validation failure, dependency state issue, side effects in constructor, or initialization assumptions.
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

# Case 3 — Object Becomes Unreachable
## Problem
Remove all reachable references and investigate reachability and GC eligibility. Do not assume immediate reclamation.
## What You Know
References are removed in code path.
## Possible Causes
Hidden references remain, scope assumptions are wrong, or GC timing expectations are incorrect.
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

# Case 4 — Unexpected Object Retention
## Problem
Developer thinks lifecycle ended but object remains retained. Investigate remaining references, collections, caches and static state.
## What You Know
Object should be short-lived based on intent.
## Possible Causes
Ownership mismatch, retained references, container/cache retention, or static roots.
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

# Case 5 — Long-Lived Object Retains Short-Lived Objects
## Problem
Long-lived service/cache retains objects that should be short-lived. Investigate ownership and lifecycle mismatch.
## What You Know
Heap indicates short-lived objects survive much longer than expected.
## Possible Causes
Retention by long-lived parent, missing eviction, incorrect handoff, or lifecycle boundary errors.
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
