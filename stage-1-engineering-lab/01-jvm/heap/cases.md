# Case 1 — Basic Heap Exhaustion
## Problem
Service crashes with OutOfMemoryError: Java heap space. Investigate heap size, allocation, object count/size, GC and workload.
## What You Know
Crash logs show OutOfMemoryError: Java heap space.
## Possible Causes
Insufficient heap, high allocation pressure, large retained set, or workload spike.
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

# Case 2 — Unbounded Collection Growth
## Problem
Long-running service gradually consumes heap. Investigate List/Map/Set/Queue/cache/session structures and what continues growing.
## What You Know
Memory rises over time instead of stabilizing.
## Possible Causes
Collection growth without eviction, session accumulation, cache policy issue, or message backlog.
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

# Case 3 — Large Payload Processing
## Problem
File API works for small files but crashes for very large files. Investigate buffering, duplicate data, byte arrays, response buffering, object size and streaming.
## What You Know
Small payloads succeed; large payloads fail.
## Possible Causes
Whole-file buffering, duplicate in-memory copies, oversized arrays, or missing streaming strategy.
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

# Case 4 — Production-Only OOM
## Problem
Local/test work but production OOMs. Compare traffic, payloads, data volume, heap, container limits, JVM, caches and configuration.
## What You Know
Non-production environments do not reproduce the failure.
## Possible Causes
Higher production load, larger data, different memory limits, JVM flags, or configuration drift.
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

# Case 5 — -Xmx Appears to Fix It
## Problem
-Xmx4g causes OOM; -Xmx8g survives. Investigate allocation, retention, GC, workload and host/container memory. Determine whether the problem is actually fixed.
## What You Know
Increasing max heap reduces immediate failures.
## Possible Causes
Underlying retention/allocation issue still present, GC tradeoffs, or host/container memory pressure.
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
