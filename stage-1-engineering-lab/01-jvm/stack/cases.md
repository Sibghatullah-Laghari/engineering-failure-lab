# Case 1 — Infinite Recursion
## Problem
Service crashes with StackOverflowError. Investigate recursion, termination condition, input, stack trace and recent changes.
## What You Know
You have error logs showing StackOverflowError during request processing.
## Possible Causes
Missing termination, incorrect base condition, unexpected input path, or behavior change in recent code.
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

# Case 2 — Indirect/Circular Recursion
## Problem
A→B→C→A causes StackOverflowError although no method directly calls itself. Investigate call graph, callbacks, proxies and repeated stack frames.
## What You Know
No method appears self-recursive in isolation, but failure still repeats.
## Possible Causes
Circular call chain, callback cycle, proxy interception loop, or unintended event re-entry.
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

# Case 3 — Legitimately Deep Recursion
## Problem
Tree-processing algorithm works for normal input but fails for extremely deep input. Investigate input depth, algorithm, stack depth, iterative alternatives and configuration.
## What You Know
Normal datasets pass; very deep structures fail with StackOverflowError.
## Possible Causes
Input depth spike, recursion depth growth, stack size limits, or algorithm choice.
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

# Case 4 — Framework/Proxy Recursion
## Problem
Spring application shows repeating proxy/interceptor frames and StackOverflowError. Investigate generated calls, interceptors and circular invocation.
## What You Know
Stack trace includes repeating framework proxy/interceptor layers.
## Possible Causes
Interceptor chain loop, self-invocation through proxy, AOP configuration issue, or circular method path.
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

# Case 5 — Environment-Specific Stack Failure
## Problem
Same application works in one environment but fails in another. Investigate -Xss, JVM version, workload, recursion depth and environment differences.
## What You Know
Behavior differs across environments with same codebase.
## Possible Causes
Different stack size, JVM/runtime differences, request/input shape, or deployment configuration mismatch.
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
