#include<iostream>
using namespace std ;

class complexno
{
	public :
		
		int real, imag;
		complexno()
		{
			real = 0;
			imag = 0;
			
		}
		complexno(int r, int i)
		{
			real = r;
			imag = i;
		}
   		void display()
   		{
   			cout << real << "*" << imag << "i" << endl;
		   }
		complexno operator *(complexno c)
		{
			complexno temp;
			temp.real = real * c.real;
			temp.imag =	 imag * c.imag;
			
			return temp;
		}
};

int main()
{
	complexno c3;
	complexno c1(8,3);
	complexno c2(5,6);
	c3 = c1*c2;
	c3.display();
	return 0;
}

	
