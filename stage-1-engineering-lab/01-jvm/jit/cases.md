# Case 1 — Warm-Up Behavior
## Problem
Application starts slower and becomes faster after running. Investigate startup, repeated execution, runtime compilation and benchmark method.
## What You Know
Repeated runs of same path improve performance.
## Possible Causes
Warm-up effects, runtime compilation thresholds, measurement method artifacts, or cache effects.
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

# Case 2 — Same Code, Different Workload
## Problem
Same method behaves differently under different workloads. Investigate execution frequency, workload, profiling, JIT and other JVM factors.
## What You Know
Code is unchanged but workload patterns differ.
## Possible Causes
Different branch/data behavior, call frequency, memory pressure, or runtime optimization differences.
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

# Case 3 — Long-Running Performance Change
## Problem
Performance changes after extended runtime. Investigate JIT/runtime, GC, memory, threads, workload and resources. Do not automatically blame JIT.
## What You Know
Behavior shifts after long uptime.
## Possible Causes
Runtime adaptation, GC state changes, memory/threads growth, or workload/environment changes.
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

# Case 4 — JDK/JVM Upgrade Performance Change
## Problem
Performance differs after Java/JVM upgrade. Investigate JVM/compiler, GC, options, hardware, workload and benchmark method.
## What You Know
Upgrade introduced measurable performance differences.
## Possible Causes
Different defaults, compiler behavior, GC policy, option changes, or benchmark inconsistency.
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

# Case 5 — Production Performance Regression
## Problem
After deployment p95 increases and throughput decreases. Investigate application code, JIT/runtime, GC, workload, configuration and environment.
## What You Know
Deployment correlated with latency and throughput regression.
## Possible Causes
Code-path changes, runtime configuration differences, resource contention, or workload/environment variation.
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
