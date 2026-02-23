1. State Interface
- Defines common actions that all states must support.

2. VendingMachine (Context Class)
- Stores inventory and balance
- Holds current state reference
- Delegates actions to current state
- Contains no state-specific logic

3. IdleState

- Allows item selection
- Disallows coin insertion and dispensing

4. ItemSelectedState
- Allows coin insertion and dispensing
- Disallows item selection

5. DispensingState
- No operations allowed
- Automatically returns to Idle after dispensing

6. OutOfOrderState
- Disallows Everything

7. Example Usage


Why This Improves Maintainability

Single Responsibility — each state manages its own behavior.

Open/Closed Principle — new states can be added without modifying existing logic.

Removes complex conditionals from VendingMachine.

Clear state transitions handled within state classes.