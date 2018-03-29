
x = int(input())
inputs=[]
for i in range(0,x):
	number = input()
	inputs.append(number)
def match_criteria(param):
	param=list(str(param))
	tInputs=[int(i) for i in param ]
	check_True=[]
	for i in tInputs:
		if i%2 == 0:
			check_True.append("True")
		else:
			check_True.append("False")	
	if "False" in check_True:
		return False		
	else:
		return True	
def increment(parameter):
	steps=0
	while not match_criteria(parameter):
		parameter+=1
		steps+=1
	return steps
def  decrement(parameter):
	
	steps=0
	while not match_criteria(parameter):
		parameter-=1
		steps+=1
	return steps
inc_steps=[]
dec_steps=[]
for i in range(len(inputs)):
	#steps	
	inc_steps.append(increment(int(inputs[i])))
	#dec_steps.append(decrement(int(inputs[i])))
for i in range(len(inc_steps)):
	if inc_steps[i]<dec_steps[i]:
		print("Case #"+str(i+1)+": "+str(inc_steps[i]))
	#elif inc_steps[i] >= dec_steps[i]:	
		#print("Case #"+str(i+1)+": "+str(dec_steps[i]))
