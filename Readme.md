First learn how App Works
	Main Thread is used for small operations,ui interactions,button click,Mathematical Operations, small Logical Operations
	Main Thread will be blocked if operations takes too long so it freezes the Application and crashes
	So we use background threads as many as we needed
	but there a limit of creating bk thread, makes it out of memory
	Solution is Corontines

Corountines
	This can perform multiple operations in single bk thread
	Definition: Light weight Threads and can run in parallel also can communication with other Corountines. Important Corountines are not Thread
	Difference Corountines VS Threads is Corountines are very very cheap can create as many we want but We cannot create as many threads we want it will crash the app

How to use Corountines


Difference between thread.sleep and delay
	thread.sleep blocks the thread itself
	delay in corountines blocks only the corountines not the thread
	after delay is executed below the delay call other codes may execute in different threads

what is suspend modifier or suspend function
	A function with a suspend modifier is known as suspending function.
	The suspending functions are only allowed to be called from a corountine or from another suspending function.
	We cannot call it from outside corountine

launch{} creates corountines in local scope, life span of this corountines is local scope of where it get created
GlobalCorountines are top-level corountines and can survice entire life of the application

launch{} get scope of parent where it runs so its possible to run on main thread

Corountine builders: launch, async and run blocking
launch and async are non-blocking in nature but runblocking blocks the thread

We can only the cancel cooperative corountines
	its only cooperative if the function uses delay(),yield(),withContect(,withTimeout() etc, which belongs to kotlinx.corountines package
	we can use isActive inside corountine to make it cooperative
	when cooperative corountine is canceled it will throw cancellationException

async{}
launch{}
	both helps us to run the code concurrently, but async{} can help us return the value if we wanted with await() call

all corountine builders attaches to new CorountineScope by default
Dispatchers decide the thread of the corountine
Dispatcher.Default similar to GlobalScope.launch run in background thread
Dispatcher.unconfined inherits from parent if it is main thread run in main or in background thread, it can change its thread in future if suspending function is called in between
