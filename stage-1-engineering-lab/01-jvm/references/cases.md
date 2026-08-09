# Case 1 — Two References, One Object
## Problem
User a=new User(); User b=a; changing b changes a. Investigate identity, objects, references and aliasing.
## What You Know
State updates through one variable appear through another.
## Possible Causes
Shared object aliasing, mutable state, or mistaken copy assumptions.
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

# Case 2 — One Reference Becomes null
## Problem
a=null but object remains accessible. Investigate other references and reachability.
## What You Know
A variable is null, yet behavior shows object still used.
## Possible Causes
Additional references elsewhere, captured references, or container-held references.
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

# Case 3 — Hidden Collection Reference
## Problem
Object appears unused but remains in memory. Investigate collections, queues, maps and caches retaining it.
## What You Know
Expected object lifecycle ended, but memory inspection still finds objects.
## Possible Causes
Retention by collection/map/cache, delayed cleanup, or queue backlog.
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

# Case 4 — Static Reference Retention
## Problem
Objects remain reachable for application lifetime. Investigate static fields, singleton state, registries and caches.
## What You Know
Objects survive as long as process runs.
## Possible Causes
Static roots, singleton ownership, global registries, or lifecycle mismatch.
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

# Case 5 — Deep Reference Chain
## Problem
Root→Service→Cache→Map→User→LargeObject. Investigate the retaining path and determine who keeps the object alive.
## What You Know
Heap analysis shows a long retainment chain.
## Possible Causes
Unexpected ownership chain, cache retention, or root-level references preventing reclamation.
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
