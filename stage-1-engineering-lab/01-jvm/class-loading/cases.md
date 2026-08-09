# Case 1 — ClassNotFoundException
## Problem
Dynamic loading attempts to load unavailable class. Investigate classpath, dependency, packaging and dynamic loading.
## What You Know
Failure occurs during explicit dynamic class loading.
## Possible Causes
Missing artifact, wrong class name, classpath omission, or packaging issue.
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

# Case 2 — NoClassDefFoundError
## Problem
Compilation succeeds but runtime cannot resolve a required class. Investigate compile-time/runtime dependencies and packaging.
## What You Know
Code builds successfully but fails at runtime.
## Possible Causes
Dependency absent at runtime, shading/packaging mismatch, or split-classpath issue.
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

# Case 3 — Dependency Version Conflict
## Problem
Libraries require incompatible versions. Investigate dependency tree, resolved version, runtime class and linkage.
## What You Know
Runtime behavior differs from compile expectations.
## Possible Causes
Version conflict, transitive override, binary incompatibility, or linkage mismatch.
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

# Case 4 — Static Initialization Failure
## Problem
Class initialization triggers exception. Investigate static fields/blocks, initialization order and underlying exception.
## What You Know
Failure starts when class is first used.
## Possible Causes
Exception in static block, bad config at init time, or ordering dependency.
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

# Case 5 — Production Classpath Difference
## Problem
Local/CI work but production class loading fails. Compare JAR contents, runtime classpath, dependency packaging, artifact and classloader behavior.
## What You Know
Only production fails class loading with same source revision.
## Possible Causes
Deployment artifact mismatch, runtime classpath drift, classloader differences, or environment packaging issue.
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
